//package lab8;
//
//import javax.swing.text.Segment;
//import java.util.ArrayList;
//
//class Controler{
//
//	String stationName;
//
//	ArrayList<Controler> neighbourController;
//
//	//storing station train track segments
//	ArrayList<Segment> list = new ArrayList<Segment>();
//
//	public Controler(String gara) {
//		stationName = gara;
//	}
//
//	void setNeighbourController(Controler v){
//		neighbourController.add(v);
//	}
//
//	void addControlledSegment(Segment s){
//		list.add(s);
//	}
//
//	/**
//         * Check controlled segments and return the id of the first free segment or -1 in case there is no free segment in this station
//         *
//	 * @return
//	 */
//	int getFreeSegmentId(){
//		for(Segment s:list){
//			if(s.hasTrain()==false)
//				return s.id;
//		}
//		return -1;
//	}
//
//	void controlStep(){
//			//check which train must be sent
//
//			for(Segment segment:list){
//				if(segment.hasTrain()){
//					Train t = segment.getTrain();
//
//					for (Controler controler : neighbourController) {
//							if(t.getDestination().equals(controler.stationName)){
//							//check if there is a free segment
//							int id = controler.getFreeSegmentId();
//							if(id==-1){
//								System.out.println("Trenul +"+t.name+"din gara "+stationName+" nu poate fi trimis catre "+controler.stationName+". Nici un segment disponibil!");
//								return;
//							}
//							//send train
//							System.out.println("Trenul "+t.name+" pleaca din gara "+stationName +" spre gara "+ controler.stationName);
//							segment.departTRain();
//							controler.arriveTrain(t,id);
//					}
//					}
//				}
//			}//.for
//
//		}//.
//
//
//	public void arriveTrain(Train t, int idSegment){
//		for(Segment segment:list){
//			//search id segment and add train on it
//			if(segment.id == idSegment)
//				if(segment.hasTrain()==true){
//					System.out.println("CRASH! Train "+t.name+" colided with "+segment.getTrain().name+" on segment "+segment.id+" in station "+stationName);
//					return;
//				}else{
//					System.out.println("Train "+t.name+" arrived on segment "+segment.id+" in station "+stationName);
//					segment.arriveTrain(t);
//					return;
//				}
//		}
//
//		//this should not happen
//		System.out.println("Train "+t.name+" cannot be received "+stationName+". Check controller logic algorithm!");
//
//	}
//
//
//	public void displayStationState(){
//		System.out.println("=== STATION "+stationName+" ===");
//		for(Segment s:list){
//			if(s.hasTrain())
//				System.out.println("|----------ID="+s.id+"__Train="+s.getTrain().name+" to "+s.getTrain().destination+"__----------|");
//			else
//				System.out.println("|----------ID="+s.id+"__Train=______ catre ________----------|");
//		}
//	}
//}