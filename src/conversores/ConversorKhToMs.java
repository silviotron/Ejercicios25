/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversores;

/**
 *
 * @author alumno
 */
public class ConversorKhToMs implements IConversor{

    @Override
    public double convertAToB(double a) {
        return a/3.6; 
    
    }

    @Override
    public double convertBToA(double b) {
        return b*3.6;
    }

    @Override
    public String getAname() {
        return "Km/h";
    }
    
    @Override
    public String getASmall() {
        return "Km/h";
    }    

    @Override
    public String getBname() {
        return "m/s";
    }

    @Override
    public String getBSmall() {
        return "m/s";
    }


}
