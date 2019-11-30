package edu.citytech.cst;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import com.google.gson.Gson;

public class TestReadFile {

	public static void main(String args[]) {

		String fileName = "/data/employee/employee-data.json";
		
		
        
		Gson gson = new Gson();
		
		
		//read file into stream, try-with-resources
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

			stream.map(  json -> gson.fromJson(json, Employee.class))
			
			.filter(x -> x.getDays().getMonday() > 5)
			.filter(f -> f.getEmpid().startsWith("M"))
			.filter(f -> Integer.parseInt(f.getEmpid().substring(2)) > 4000)

			.forEach(System.out::println);
			; // map helps convert the string

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
