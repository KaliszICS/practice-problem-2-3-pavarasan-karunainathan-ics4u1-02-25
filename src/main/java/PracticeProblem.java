public class PracticeProblem{
	static void bubbleSortString(String[] strings){
		for(int i = 0; i < strings.length-1; ++i){
			boolean sorted = true;
			for(int j = 0; j < strings.length-1-i; ++j){
				if(strings[j].toLowerCase().compareTo(strings[j+1].toLowerCase()) > 0){
					String temp = strings[j];
					strings[j] = strings[j+1];
					strings[j+1] = temp;
					sorted = false;
				}
			}
			if(sorted) return;
		}
	}
	public static void main(String args[]){}
}
