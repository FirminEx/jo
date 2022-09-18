import java.util.ArrayList;

class MatchHandball extends Epreuve{
	ArrayList<Handballer> pays1,pays2,premier,deuxieme;
	
	public Class getTypeAthlete(){	
		return Handballer.class;
	}
	
	
	public MatchHandball(String pDate,ArrayList<Handballer> pPays1,ArrayList<Handballer> pPays2){
		super(pDate);
		this.pays1=pPays1;
		this.pays2=pPays2;
	}
	
	public void match(){	
		int stat1=0;
		int stat2=0;
		for(int i=0;i<this.pays1.size();i++){
			stat1+=this.pays1.get(i).jouer();
		}
		for(int i=0;i<this.pays2.size();i++){
			stat2+=this.pays2.get(i).jouer();
		}
		if(stat1>=stat2){
			this.premier=pays1;
			this.deuxieme=pays2;
		}else{	
			this.deuxieme=pays1;
			this.premier=pays2;
		}
	}
	
	public ArrayList<Handballer> getPremier(){
		return this.premier;
	}
	
	public ArrayList<Handballer> getDeuxieme(){
		return this.deuxieme;
	}
	
}
