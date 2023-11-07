package abstraction;

public abstract class Word {
private	String name ;
	
	public Word(String name) {
		this.name = name;
	}
	
	//abstract method
	public abstract void work();
	
	@Override
	public String toString(){
		 return "Name="+this.name;
	}

	public void changeName(String newName) {
		this.name = newName;
	}	
}