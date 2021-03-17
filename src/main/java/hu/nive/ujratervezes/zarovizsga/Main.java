package hu.nive.ujratervezes.zarovizsga;

import hu.nive.ujratervezes.zarovizsga.dogtypes.DogTypes;
import org.postgresql.ds.PGSimpleDataSource;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        PGSimpleDataSource dataSource = new PGSimpleDataSource();
        dataSource.setDatabaseName("t360");
        dataSource.setUser("geoed");
        dataSource.setPassword("geo0524");
        List<String> returnedList = new ArrayList<>();
        DogTypes myDogTypes = new DogTypes(dataSource);
        System.out.println(myDogTypes.getDogsByCountry("Greece"));
    }
}
