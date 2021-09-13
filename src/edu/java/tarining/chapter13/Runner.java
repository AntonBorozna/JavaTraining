package edu.java.tarining.chapter13;

/*
 * В каждом из заданий необходимо выполнить следующие действия:
 * • организацию соединения с базой данных вынести в отдельный класс, метод
 * которого возвращает соединение;
 * • создать БД. Привести таблицы к одной из нормальных форм;
 * • создать класс для выполнения запросов на извлечение информации из БД
 * с использованием компилированных запросов;
 * • создать класс на модификацию информации.
 * Планеты. В БД хранится информация о планетах, их спутниках и галактиках.
 * Для планет необходимо хранить:
 * • название;
 * • радиус;
 * • температуру ядра;
 * • наличие атмосферы; 
 * • наличие жизни;
 * • спутники.
 * Для спутников необходимо хранить:
 * • название;
 * • радиус;
 * • расстояние до планеты.
 * Для галактик необходимо хранить:
 * • название;
 * • планеты.
 * • Вывести информацию обо всех планетах, на которых присутствует жизнь,
 * и их спутниках в заданной галактике.
 * • Вывести информацию о планетах и их спутниках, имеющих наименьший
 * радиус и наибольшее количество спутников.
 * • Вывести информацию о планете, галактике, в которой она находится, и ее
 * спутниках, имеющей максимальное количество спутников, но с наименьшим общим объемом этих спутников.
 * • Найти галактику, сумма ядерных температур планет которой наибольшая.
 */

public class Runner {

	public static void main(String[] args) {

		String sql1 = "select * from productsdb.planets pl\r\n"
				+ "join productsdb.satellite st on st.PlanetId = pl.Id \r\n" + "where DoesLifeExist = true;";

		String sql2 = "with counts as\r\n"
				+ "(select satellite.Id, satellite.PlanetId, count(*) as counter from productsdb.satellite\r\n"
				+ "group by PlanetId\r\n" + ")\r\n" + "select * from productsdb.satellite st\r\n"
				+ "join productsdb.planets pl on pl.Id = st.PlanetId\r\n" + "join counts ct on ct.PlanetId = pl.Id\r\n"
				+ "where pl.Radius = (Select min(Radius) from planets) or \r\n"
				+ "ct.counter = (select max(counter) from counts);";

		String sql3 = "with counts as\r\n"
				+ "(select satellite.Id, satellite.PlanetId, count(*)as counter, sum(4/3 * 3.14 * satellite.Radius^3) as vol from productsdb.satellite\r\n"
				+ "group by PlanetId\r\n" + ")\r\n"
				+ "select st.SatelliteName, st.Radius, pl.PlanetName, gl.GalaxyName, counter , vol from productsdb.satellite st\r\n"
				+ "join productsdb.planets pl on pl.Id = st.PlanetId\r\n" + "join counts ct on ct.PlanetId = pl.Id\r\n"
				+ "join  productsdb.galaxy gl on gl.id = pl.GalaxyId\r\n"
				+ "where ct.counter = (select max(counter) from counts) or vol = (select max(vol) from counts);";

		String sql4 = "with counter as \r\n" + "(select * , sum(CoreTemperature) tempsum from planets\r\n"
				+ "group by GalaxyId\r\n" + ") select GalaxyName from productsdb.galaxy gl\r\n"
				+ "join counter ct on ct.GalaxyId = gl.Id\r\n"
				+ "where tempsum = (select max(tempsum) from counter)\r\n" + "group by gl.Id;";

		SQLRequestor run = new SQLRequestor();
		run.SelectInformation(sql4);

	}
}
