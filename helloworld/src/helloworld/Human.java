package helloworld;

public class Human {
	private int height;
	private static int population = 4;
	public static boolean is_manmal = true;
	
	public Human (int h) {
		this.height = h;
		Human.population = Human.population + 1;
	}
	
	public int getHeight()
    {
       return this.height;
    }

    /**
     * mutator
     */
    public void growHeight(int h)
    {
        this.height = this.height + h;
    }

    /**
     * breath
     */
    public void breath()
    {
        System.out.println("hu...hu...");
    }
    
    public static int getPopulation()
    {
        return Human.population;
    }

	
}
