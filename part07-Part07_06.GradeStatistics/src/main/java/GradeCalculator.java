
import java.awt.BorderLayout;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexa
 */
public class GradeCalculator {
    private double totalPoints;
    private double totalInputs;
    private double totalPointsPassing;
    private double totalInputsOver50 = 0;
    private String lessThan50 = "";
    private String lessThan60 = "";
    private String lessThan70 = "";
    private String lessThan80 = "";
    private String lessThan90 = "";
    private String lessThan100 = "";
    
    
    public void addTotalInputs() {
        this.totalInputs++;
    }
    
    public void addTotalPoints(double input) {
        if(input >= 50) {
            this.totalPointsPassing += input;
            this.totalInputsOver50++;
            if(input < 60) {
                this.lessThan60 += "*";
            } else if(input < 70) {
                this.lessThan70 += "*";
            } else if(input < 80) {
                this.lessThan80 += "*";
            } else if(input < 90) {
                this.lessThan90 += "*";
            } else {
                this.lessThan100 += "*";
            } 
            } else if(input >= 0 && input < 50) {
                this.lessThan50 += "*"; 
            }   
            this.totalPoints += input;
        }
        
    public double getTotalInputsOver50() {
        return this.totalInputsOver50;
    }
    
    public void pointAverage() {
        System.out.println("Point average (all): " +(this.totalPoints/this.totalInputs));
    }
    
    public void pointPassingAverage() {
        if(this.totalInputsOver50 == 0) System.out.println("Point average (passing): -");
        else 
        System.out.println("Point average (passing): " +(this.totalPointsPassing/this.totalInputsOver50));
    }
    
    public void passPercentage() {
        System.out.println("Pass percentage: " +100*(this.totalInputsOver50/this.totalInputs));
    }
    
    public void gradeDistribution() {
        System.out.println("5: "+this.lessThan100);
        System.out.println("4: "+this.lessThan90);
        System.out.println("3: "+this.lessThan80);
        System.out.println("2: "+this.lessThan70);
        System.out.println("1: "+this.lessThan60);
        System.out.println("0: "+this.lessThan50);
       
    }
}
