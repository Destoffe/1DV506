package cw222ng_lab4.nyhetsbyra;

public class NyhetsbyraMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tidning tidningOsby = new Tidning();
		Tidning tidningV�xj� = new Tidning();
		Tidning fejkheter24 = new Tidning();
		Nyhetsbyra svenskaNyheter = new Nyhetsbyra();
		svenskaNyheter.registerNewspaper(tidningOsby); // Registrerar tidningen till nyhetsbyr�n
		svenskaNyheter.registerNewspaper(tidningV�xj�);
		svenskaNyheter.registerNewspaper(fejkheter24);
		tidningOsby.addNews("En man dog"); // L�gger till lite slump�ssiga nyheter till tidningarna
		tidningOsby.addNews("en flicka tappade sin glass");
		tidningV�xj�.addNews("folk halkade p� isen");
		tidningV�xj�.addNews("folket halkade aldrig, fel k�lla vi ber om urs�kt");
		tidningV�xj�.addNews("folk halkade visst, katastrof");
		fejkheter24.addNews("du anar inte vad folk gjorde n�r de halkade, du kommer tappa hakan");

		svenskaNyheter.gatherNews(); //Samlar ihop nyheterna och delar ut till alla tidningar
		System.out.println("tidningV�xj� har " + tidningV�xj�.amountOfNews()+ " st nyheter lagrade"); //Printar antalet nyheter som tidningen nu har
		System.out.println("tidningOsby har " + tidningOsby.amountOfNews() + " st nyheter lagrade");
		System.out.println("fejkheter24 har " +fejkheter24.amountOfNews() +" st nyheter lagrade");
		System.out.println(tidningV�xj�.printNews(5)); //Printar slumpm�ssiga nyheter tidingarna har f�tt av nyhetsbyr�n
		System.out.println(tidningOsby.printNews(4));
		System.out.println(fejkheter24.printNews(1));


		

	}

}
