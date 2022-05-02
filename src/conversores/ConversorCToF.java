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
public class ConversorCToF implements IConversor{

    @Override
    public double convertAToB(double a) {
        return (a * 9/5) + 32; 
    
    }

    @Override
    public double convertBToA(double b) {
        return (b - 32) * 5 / 9;
    }

    @Override
    public String getAname() {
        return "Celsius";
    }
    
    @Override
    public String getASmall() {
        return "ºC";
    }    

    @Override
    public String getBname() {
        return "Farenheit";
    }

    @Override
    public String getBSmall() {
        return "ºF";
    }


}
