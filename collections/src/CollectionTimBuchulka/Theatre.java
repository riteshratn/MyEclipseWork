package CollectionTimBuchulka;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
	private final String theatreName;
	private List<Seat> seats=new ArrayList<>();
	public Theatre(String theatreName,int numRows,int seatPerRow) {
		//super();
		this.theatreName = theatreName;
		int lastRow='A'+(numRows-1);
		for(char row='A';row<=lastRow;row++) {
			for(int seatNum=1;seatNum<=seatPerRow;seatNum++) {
				Seat seat=new Seat(row + String.format("%02d",seatNum));
				seats.add(seat);
				
			}
		}
	}
	public String getTheatreName() {
		return theatreName;
	}
	public boolean reserveSeat(String seatNumber) {
		Seat requestedSeat=null;
		for(Seat seat:seats) {
			if(seat.getSeatNumber().equals(seatNumber)) {
				requestedSeat=seat;
				break;
			}
		}
		if(requestedSeat==null) {
			System.out.println("There  is no seat"+ seatNumber);
			return false;
		}
		return requestedSeat.reserved();
	}
	public void getSeat() {
		for(Seat seat:seats) {
			System.out.println(seat.getSeatNumber());
		}
	}
	
	private class Seat{
		private final String seatNumber;
		private boolean reserved=false;
		public Seat(String seatNumber) {
			//super();
			this.seatNumber = seatNumber;
		}
		public boolean reserved() {
			
			if(!this.reserved) {
				this.reserved=true;
				System.out.println("Seat"+seatNumber +"reserved");
			}else {
				return false;
			}
			return reserved;
		}
		public boolean cancel() {
			if(this.reserved) {
				this.reserved=false;
				System.out.println("Reservtion of seat"+ seatNumber+ " Cancelled");
				return true;
			}else {
				return false;
			}
		}
		public String getSeatNumber() {
			return seatNumber;
		}
		
	}

}
