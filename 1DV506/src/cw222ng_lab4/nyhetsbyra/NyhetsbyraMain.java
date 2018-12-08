package cw222ng_lab4.nyhetsbyra;

public class NyhetsbyraMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tidning tidningOsby = new Tidning();
		Tidning tidningVäxjö = new Tidning();
		Tidning fejkheter24 = new Tidning();
		Nyhetsbyra svenskaNyheter = new Nyhetsbyra();
		svenskaNyheter.registerNewspaper(tidningOsby); // Registrerar tidningen till nyhetsbyrån
		svenskaNyheter.registerNewspaper(tidningVäxjö);
		svenskaNyheter.registerNewspaper(fejkheter24);
		tidningOsby.addNews("En man dog"); // Lägger till lite slumpässiga nyheter till tidningarna
		tidningOsby.addNews("en flicka tappade sin glass");
		tidningVäxjö.addNews("folk halkade på isen");
		tidningVäxjö.addNews("folket halkade aldrig, fel källa vi ber om ursäkt");
		tidningVäxjö.addNews("folk halkade visst, katastrof");
		fejkheter24.addNews("du anar inte vad folk gjorde när de halkade, du kommer tappa hakan");

		svenskaNyheter.gatherNews(); //Samlar ihop nyheterna och delar ut till alla tidningar
		System.out.println("tidningVäxjö har " + tidningVäxjö.amountOfNews()+ " st nyheter lagrade"); //Printar antalet nyheter som tidningen nu har
		System.out.println("tidningOsby har " + tidningOsby.amountOfNews() + " st nyheter lagrade");
		System.out.println("fejkheter24 har " +fejkheter24.amountOfNews() +" st nyheter lagrade");
		System.out.println(tidningVäxjö.printNews(5)); //Printar slumpmässiga nyheter tidingarna har fått av nyhetsbyrån
		System.out.println(tidningOsby.printNews(4));
		System.out.println(fejkheter24.printNews(1));


		

	}

}
