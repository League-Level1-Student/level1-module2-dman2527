package _07_tea_party;

public class teaParty {
    public String welcome(String name, boolean isWoman, boolean isKnighted) {
    	String title = "";
    	if(isWoman == true && isKnighted == true) {
			title = "Lady";
    	}
    	if(isWoman == true && isKnighted == false) {
    		title = "Ms.";
    	}
    	if(isWoman == false && isKnighted == true) {
    		title = "Sir";
    	}
    	if(isWoman == false && isKnighted == false) {
    		title = "Mr.";
    	}
    	
    	String welcome ="Hello " +  title + " "+ name  ;
    	return welcome;
        
    }
}

