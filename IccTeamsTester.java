class IccTeamsTester
{
public static void main(String a[]){
    
	 IccTeams iccteams = new IccTeams();
	 iccteams.name = "AUS";
	 iccteams.won = 15;
	 iccteams.fail = 30;
	 iccteams.numberOfMatches = 45;
	 System.out.println(iccteams.name+" "+iccteams.won+" "+iccteams.fail+" "+iccteams.numberOfMatches);
     
	 iccteams.write();
	 
	 
	  IccTeams iccteams1 = new IccTeams();
	 iccteams1.name = "IND";
	 iccteams1.won = 25;
	 iccteams1.fail = 20;
	 iccteams1.numberOfMatches =45;
	 System.out.println(iccteams1.name+" "+iccteams1.won+" "+iccteams1.fail+" "+iccteams1.numberOfMatches);
     
	 iccteams1.write();
	 
	  IccTeams iccteams2 = new IccTeams();
	 iccteams2.name = "PAK";
	 iccteams2.won = 35;
	 iccteams2.fail = 15;
	 iccteams2.numberOfMatches = 45;
	 System.out.println(iccteams2.name+" "+iccteams2.won+" "+iccteams2.fail+" "+iccteams2.numberOfMatches);
     
	 iccteams2.write();
	 
	 
	 
	 
	 
	 
	 
	 }
	 }