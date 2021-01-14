/********************
 * Andre Stadler
 * 14.01.2021
 ********************/
package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CarDatabase
{
    protected HashMap< String, Vehicle> database = new HashMap<>();


    public CarDatabase()    //Funktion von Prielinger
    {
        MagicGenerator magicGenerator = new MagicGenerator();
        for(int i = 0; i < 1000; i++)
        {
            String manufacturer = magicGenerator.getRandomManufacturer();
            String licencePlate = magicGenerator.getRandomLicencePlate();
            Vehicle vehicle = new Vehicle(magicGenerator.getRandomColor(),magicGenerator.getRandomName(),manufacturer,magicGenerator.getRandomModel(manufacturer),licencePlate);
            database.put(licencePlate,vehicle);
            System.out.println(vehicle.getLicensePlate());
        }

    }

    public ArrayList<Vehicle> patternSearch(String searchTxt)
    {

        ArrayList<Vehicle> newList = new ArrayList<>();
        final long timeStart1 = System.currentTimeMillis();
        for (Map.Entry entry: database.entrySet())
        {
            if (entry.getKey().toString().contains(searchTxt))
                newList.add(database.get(entry.getKey()));

        }
        final long timeEnd1 = System.currentTimeMillis();
        final long erg1 = timeEnd1 - timeStart1;
        System.out.printf("Time for Pattern Search (in ms): ");
        System.out.println(erg1);
        return newList;


    }


    public Vehicle exactSearch(String searchTxt)
    {

        if(database.get(searchTxt) == null)
        {
            return null;
        }
        else return database.get(searchTxt);


    }







}
