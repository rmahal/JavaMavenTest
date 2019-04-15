package raj;

class HelloWorld{
	public static void main(String[] args){
		System.out.println("HwlloWorld!");
		MyWorld world = new MyWorld(args[0]);
		System.out.println(world.toString());
	}
}
