package Practicegitcommands;

public class PragramFile {

    public void add(int a, int b){
        int c = a + b;
        System.out.println("The addition of given values is " + c);
        }
        
        public void add(double a, double b){
        double c = a * b;
        System.out.println("The addition of given values is " + c);
        }
            public static void main(String[] args) {
        
                PragramFile mainclass = new PragramFile();
                
               mainclass.add(3, 8);
               mainclass.add(3.4, 5.6); 
                
            }
        
        }

