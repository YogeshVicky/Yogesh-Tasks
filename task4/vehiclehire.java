import java.io.*;

class vehicle{


public String Make, Model, Fueltype;
public int Year;

public float totaldis, fuelused, fueleff, maxspeed;


}

class Truck extends vehicle{

public void truckcal(){
    
Make = "Volvo";
Model = "Volvo FH";
Fueltype = "Diesel";
Year = 2020;

totaldis = 50;
fuelused= 20;
maxspeed = 80;

fueleff = totaldis/fuelused;



System.out.println("    ****** TRUCK ******" + '\n' + "Make:                  " + Make + '\n' + "Model:                 " + Model + '\n' + "Fuel Type:             "+ Fueltype+'\n' +"Year:                  " + Year + '\n' 
+ "Distance travelled Km: " + totaldis+ '\n'+ "Maximum speed Kmph:    " + maxspeed+'\n' +"Fuel Efficiency Kmpl:  " + fueleff );

}
}

class Car extends Truck{

public void carcal(){

Make = "Audi";
Model = "Audi A6";
Fueltype = "Petrol";
Year = 2023;

totaldis = 50;
fuelused= 30;
maxspeed = 250;

fueleff = totaldis/fuelused;

System.out.println('\n' + "     ****** CAR ******" + '\n' + "Make:                  " + Make + '\n' + "Model:                 " + Model + '\n' + "Fuel Type:             "+ Fueltype+'\n' +"Year:                  " + Year + '\n' 
+ "Distance travelled Km: " + totaldis+ '\n'+ "Maximum speed Kmph:    " + maxspeed+'\n' +"Fuel Efficiency Kmpl:  " + fueleff );



}
}

class Bike extends Car{

public void bikecal(){

Make = "Ducati";
Model = "Ducati Diavel V4";
Fueltype = "95 Octane";
Year = 2023;

totaldis = 50;
fuelused= 40;
maxspeed = 260;

fueleff = totaldis/fuelused;

System.out.println('\n' + "     ****** BIKE ******" + '\n' + "Make:                  " + Make + '\n' + "Model:                 " + Model + '\n' + "Fuel Type:             "+ Fueltype+'\n' +"Year:                  " + Year + '\n' 
+ "Distance travelled Km: " + totaldis+ '\n'+ "Maximum speed Kmph:    " + maxspeed+'\n' +"Fuel Efficiency Kmpl:  " + fueleff );


}
}

class vehiclehire{
    public static void main(String[]args){
        Bike b1 = new Bike();
        b1.truckcal();
        b1.carcal();
        b1.bikecal();
    }
}



