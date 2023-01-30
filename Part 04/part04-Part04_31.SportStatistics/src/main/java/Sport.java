/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author compl
 */
public class Sport {
    private String homeTeam, visitTeam;
    private int homePoints, visitPoints;
    
    public Sport(String homeTeam, String visitTeam, int homePoints, int visitPoints) {
        this.homeTeam = homeTeam;
        this.visitTeam = visitTeam;
        this.homePoints = homePoints;
        this.visitPoints = visitPoints;
    }
    
    public String getHomeTeam() {
        return this.homeTeam;
    }
    
    public String getVisitTeam() {
        return this.visitTeam;
    }
    
    public int getHomePoints() {
        return this.homePoints;
    }
    
    public int getVisitPoints() {
        return this.visitPoints;
    }
}
