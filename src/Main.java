import java.util.Scanner;

public class Main {
	private static ISubscriber subscribers [] = {
			new CircleCircumference(),
			new CircleVolume(),
		  new MultiplicationSeries(),
			new CircleAreaObserver(),
			new Power(),
			new SphereVolume(),
			new SphereAreaSub(),
		        new summtionSeries(),
      new LucasSeriesSub()
	};
	public static void main(String[] args) {
		Topic mathTopic = new Topic();
		for (ISubscriber sub : subscribers) {
			mathTopic.addSubscriber(sub);
		}
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		mathTopic.dispatchEvent(input);
	}
}
