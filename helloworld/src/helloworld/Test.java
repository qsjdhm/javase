package helloworld;


public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Human aPerson = new Human(160);
	        System.out.println(aPerson.getHeight());
	        aPerson.growHeight(170);
	        System.out.println(aPerson.getHeight());
	        aPerson.repeatBreath(2);
	}

}


class Human
{
    /**
     * constructor
     */
    public Human(int h)
    {
        this.height = h;
        System.out.println("I'm born");
    }

    /**
     * accessor
     */
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
      * encapsulated, for internal use
      */
    private void breath()
    {
        System.out.println("hu...hu...");
    }


   /**
    * call breath()
    */
    public void repeatBreath(int rep)
    {
        int i;
        for(i = 0; i < rep; i++) {
            this.breath();
        }
    }

    private int height; // encapsulated, for internal use
}