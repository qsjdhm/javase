package helloworld;

import helloworld.Human;

public class Woman extends Human
{
    public Woman(int h) {
		super(h);
		// TODO 自动生成的构造函数存根
	}

	/**
     * new method
     */
    public Human giveBirth()
    {
        System.out.println("Give birth");
        return (new Human(20));
    }
    
    public void breath()
    {
        super.breath();
        System.out.println("su...");
    }
}
