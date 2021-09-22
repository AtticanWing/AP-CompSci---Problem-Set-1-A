// Vanessa Lu
// Sep. 21, 2021
// Problem Set 1-A

class Problem_Set_1A {
    public static void main (String[] args) {
        
        //Quadratic---------------------------------------------------------------------------
        
        double a = 1; //coeff of x^2
        double b = 5; //coeff of x
        double c = 6; //y intercept
        double i;   //intermediate values
        double x_1;   //solution 1
        double x_2;   //solution 2
        
        i = (b*b)-(4*a*c); //calculate inside of square root
        i = Math.sqrt(i);  //calculate output of square root
        x_1 = (-b-i)/(2*a); //calculate solution 1
        x_2 = (-b+i)/(2*a); //calculate solution 2
        
        System.out.println("QUADRATIC FORMULA"); //print output of solutions
        System.out.println("The solutions for " + (int)a + "x^2 + " + (int)b + "x + " + (int)c + " are " + x_1 + " and " + x_2 + ".");
        System.out.println();
        
        //Slope-------------------------------------------------------------------------------
        
        double x1 = 0; //x value of first point
        double y1 = 0; //y vallue of first point
        double x2 = 2; //x value of second point
        double y2 = 3; //y value of second point
        double m;      //slope
        
        m = (y2 - y1)/(x2 - x1); //calculate slope
        
        System.out.println("SLOPE FORMULA"); //print output of slope
        System.out.println("A line connecting the points ("+(int)x1+", "+(int)y1+") and ("+(int)x2+", "+(int)y2+") has a slope of " + m);
        System.out.println();
        
        //Midpoint - some variables are reused from slope formula-----------------------------
        
        double Mx; //x value of midpoint
        double My; //y value of midpoint
        
        Mx = (x1+x2)/2; //calculate x value of midpoint
        My = (y1+y2)/2; //calculate y value of midpoint
        
        System.out.println("MIDPOINT FORMULA"); //print output of midpoint
        System.out.println("The midpoint between ("+(int)x1+", "+(int)y1+") and ("+(int)x2+", "+(int)y2+") is (" + Mx + ", " + My + ")");
        System.out.println();
        
        //Sum of Arithmetic Series------------------------------------------------------------
        
        double Ka = 5;  //first k terms in the ARITH. series to be added together
        double a1 = 1; //value of first term of the arith. series
        double inc = 1; //the amount each term in the arith. series increases by
        double ak; //value of last term of the arith. series
        double Sa; //sum of the arith. series
        
        ak = a1 + (inc*(Ka-1)); //calculate value of last term in the arith. series
        Sa = (Ka/2)*(a1+ak); //calculate the sum of the arith. series
        
        System.out.println("SUM OF AN ARITHMETIC SERIES"); //print output of sum
        System.out.println("The sum of the first "+ (int)Ka +" terms of an arithmetic series that starts with "+ a1 +" and increases by " + inc + " is " + Sa);
        System.out.println();
        
        //Sum of Finite Geometric Series------------------------------------------------------
        
        double r = 2; //rate the terms of the geo. series increase by, AKA common ratio
        double Kg = 3; //first k terms in the GEO. series to be added together
        double g1 = 3; //value of first term in the geo. series 
        double Sg;     //sum of the geo. series
        
        Sg = g1*((1-(Math.pow(r,Kg)))/(1-r)); //calculate sum of geo. series
        
        System.out.println("SUM OF A FINITE GEOMETRIC SERIES"); //print output of sum
        System.out.println("The sum of the first "+ (int)Kg +" terms of a finite geometric series that starts with "+ g1 +" and increases by a rate of " + r + " is " + Sg);
        System.out.println();
    }
}