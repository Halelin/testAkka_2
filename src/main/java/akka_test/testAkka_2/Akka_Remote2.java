package akka_test.testAkka_2;

import akka.actor.ActorRef;
import akka.actor.ActorSelection;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka_test.test1.ActorDemo;

public class Akka_Remote2 {
	public static void main(String[] args) {
		ActorSystem sys = ActorSystem.create("sys");
		ActorRef rmtActor =sys.actorOf(Props.create(ActorDemo.class),"rmtActor");
//		ActorSelection selection = sys.actorSelection("akka.tcp://sys@127.0.0.1:2553/user/rmtActor"); 
//		selection.tell("hello remoteActor", ActorRef.noSender());
		
		//被远程路由调用Actor
		ActorRef rmt2 = sys.actorOf(Props.create(ActorDemo.class),"rmt2");
	}
}
