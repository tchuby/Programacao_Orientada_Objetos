package Application;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Utils {
	
	private Scanner _reader;
	
	public Utils(Scanner reader) {
		this._reader = reader;
	}
	
	private void print(String outPut){
        System.out.println(outPut);
    }
	
	public Integer validateInteger(String input){
        int outInt = 0;
        boolean controlFlow = true;

        while(controlFlow){
            try{
                outInt = Integer.parseInt(input);
                controlFlow = false;
            }
            catch(NumberFormatException exception){
                print("Caracter inválido, tente novamente.");
                print("Use apenas números inteiros");
                input = _reader.next();
            }
        }
        return outInt;
    } 

    public Double validateDouble(String input){
        double outDouble = 0.00;
        boolean controlFlow = true;

        while(controlFlow){
            var modifiedInput = input.replace(',', '.');
            try{
                outDouble = Double.parseDouble(modifiedInput);
                controlFlow = false;
            }
            catch(NumberFormatException exception){
                print("Caracter inválido, tente novamente.");
                input = _reader.next();
            }
        }
        return outDouble;
    }

    public String formatDouble(Double number){
        String numberFormated = new DecimalFormat("#,##0.00")
                .format(number).toString();
        return numberFormated;
    }
}
