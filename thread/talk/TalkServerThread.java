package thread.talk;

import thread.bank.Protocol;

public class TalkServerThread extends Thread {
	public TalkServer ts = null;
	public TalkServerThread(TalkServer ts) {
		this.ts = ts;
	}
	public void run() {
		boolean isStop = false;
//		while(true) { => true 쓰는것은 무한루프에 걸릴 수 있으니 사용x. 
		while(!isStop) {
			int protocol = 0;
			switch(protocol) {
				case Protocol.LOGIN:{
					
				}break;
				case Protocol.EXIT:{
					
				}break;
			}//end of switch
		}//end of while
	}//end of run
}
