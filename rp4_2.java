import java.lang.*;
import java.util.*;

class rp4_2 {
    public static void main(String[] args){
    	try{	
		    MyQueue4 q = new MyQueue4();
		    MyQueue4 r = new MyQueue4();
		    MyQueue4 s = new MyQueue4();
		    
		    
			long start = System.currentTimeMillis();
			long end = start + 30*1000;
			while (System.currentTimeMillis() < end)
			{
				Random r1 = new Random();
				Random r2 = new Random();
				Random r3 = new Random();
				Random r4 = new Random();
				String c = generateString(r1,"●○◎★☆■□◆◇",1);
				int mark = r2.nextInt(6) + 1;
				int operation = r2.nextInt(5) + 1;
				int type = r3.nextInt(3) + 1;
				int command = r4.nextInt(3) + 1;
				if(operation==1 || operation==2 || operation==3){
					if(type==1){
						if(command==1){	
							q.enqueue(c,mark,type);
							System.out.println("enqueue " + c + "\n");
						}else if(command==2){
							r.enqueue(c,mark,type);
							System.out.println("enqueue " + c + "\n");
						}else{
							s.enqueue(c,mark,type);
							System.out.println("enqueue " + c + "\n");
						}	
					}
					if(type==2){
						if(q.queueSize()>=4){
							System.out.println(c + " ("+ mark + ","+ type + ")" + " is Balking Customer \n");
						}else{	
							if(command==1){	
								q.enqueue(c,mark,type);
								System.out.println("enqueue " + c + "\n");
							}else if(command==2){
								r.enqueue(c,mark,type);
								System.out.println("enqueue " + c + "\n");
							}else{
								s.enqueue(c,mark,type);
								System.out.println("enqueue " + c + "\n");
							}
						}
					}	
					if(type==3){	
						if(command==1){	
							q.enqueue(c,mark,type);
							System.out.println("enqueue " + c + "\n");
							if(q.queueSize()>r.queueSize() && s.queueSize()>r.queueSize()){
								q.dequeue();
								r.enqueue(c,mark,type);
								System.out.println(c + " ("+ mark + ","+ type + ")" + " is Jockeying Customer \n");	
							}else if(q.queueSize()>r.queueSize() && r.queueSize()>s.queueSize()){
								q.dequeue();
								s.enqueue(c,mark,type);
								System.out.println(c + " ("+ mark + ","+ type + ")" + " is Jockeying Customer \n");	
							}
						}else if(command==2){
							r.enqueue(c,mark,type);
							System.out.println("enqueue " + c + "\n");
							if(r.queueSize()>q.queueSize() && s.queueSize()>q.queueSize()){
								r.dequeue();
								q.enqueue(c,mark,type);
								System.out.println(c + " ("+ mark + ","+ type + ")" + " is Jockeying Customer \n");
							}else if(r.queueSize()>q.queueSize() && q.queueSize()>s.queueSize()){
								r.dequeue();
								s.enqueue(c,mark,type);
								System.out.println(c + " ("+ mark + ","+ type + ")" + " is Jockeying Customer \n");
							}	
						}else{
							s.enqueue(c,mark,type);
							System.out.println("enqueue " + c + "\n");
							if(s.queueSize()>q.queueSize() && r.queueSize()>q.queueSize()){
								s.dequeue();
								q.enqueue(c,mark,type);
								System.out.println(c + " ("+ mark + ","+ type + ")" + " is Jockeying Customer \n");
							}else if(s.queueSize()>q.queueSize() && q.queueSize()>r.queueSize()){
								s.dequeue();
								r.enqueue(c,mark,type);
								System.out.println(c + " ("+ mark + ","+ type + ")" + " is Jockeying Customer \n");
							}	
						}
					
					}	
				}
				else if(operation==4 || operation==5)
					if(q.isEmpty()==true)
						System.out.println("No person in queue");
					else
						if(command==1)
							System.out.println("dequeue: " + q.dequeue() + "\n");
						else if(command==2)
							System.out.println("dequeue: " + r.dequeue() + "\n");
						else
							System.out.println("dequeue: " + s.dequeue() + "\n");		
				System.out.println("Queue 1 "+q);
				System.out.println("\n");
				System.out.println("Queue 2 "+r);
				System.out.println("\n");
				System.out.println("Queue 3 "+s);
				System.out.println("\n --------------------------------------------------------------\n ");
				Thread.sleep(1000);
			}
			System.out.println("Final Queue 1 list: "+q);
			System.out.println("\n Final Queue 2 list: "+r);
			System.out.println("\n Final Queue 3 list: "+s);
			
		}catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
    }
    
    public static String generateString(Random rng, String characters, int length)
	{
		char[] text = new char[length];
		for (int i = 0; i < length; i++)
		{
		    text[i] = characters.charAt(rng.nextInt(characters.length()));
		}
		return new String(text);
	}
}
