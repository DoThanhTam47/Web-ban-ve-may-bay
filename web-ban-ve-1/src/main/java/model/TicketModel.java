package model;

import java.io.Serializable;
import java.util.Date;

public class TicketModel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int ticketId;
	private int gia;
	private String hangGhe;
	private String maMaybay;
	private Date ngayBay;
	private Date ngayDen;
	private String noiBay;
	private String noiDen;
	private String thoiGian;
	
	public TicketModel() {

	}

	public TicketModel(int gia, String hangGhe, String maMaybay, Date ngayBay, Date ngayDen, String noiBay,
			String noiDen, String thoiGian) {
		this.gia = gia;
		this.hangGhe = hangGhe;
		this.maMaybay = maMaybay;
		this.ngayBay = ngayBay;
		this.ngayDen = ngayDen;
		this.noiBay = noiBay;
		this.noiDen = noiDen;
		this.thoiGian = thoiGian;
	}

	public TicketModel(int ticketId, int gia, String hangGhe, String maMaybay, Date ngayBay, Date ngayDen,
			String noiBay, String noiDen, String thoiGian) {
		this.ticketId = ticketId;
		this.gia = gia;
		this.hangGhe = hangGhe;
		this.maMaybay = maMaybay;
		this.ngayBay = ngayBay;
		this.ngayDen = ngayDen;
		this.noiBay = noiBay;
		this.noiDen = noiDen;
		this.thoiGian = thoiGian;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public int getGia() {
		return gia;
	}

	public void setGia(int gia) {
		this.gia = gia;
	}

	public String getHangGhe() {
		return hangGhe;
	}

	public void setHangGhe(String hangGhe) {
		this.hangGhe = hangGhe;
	}

	public String getMaMaybay() {
		return maMaybay;
	}

	public void setMaMaybay(String maMaybay) {
		this.maMaybay = maMaybay;
	}

	public Date getNgayBay() {
		return ngayBay;
	}

	public void setNgayBay(Date ngayBay) {
		this.ngayBay = ngayBay;
	}

	public Date getNgayDen() {
		return ngayDen;
	}

	public void setNgayDen(Date ngayDen) {
		this.ngayDen = ngayDen;
	}

	public String getNoiBay() {
		return noiBay;
	}

	public void setNoiBay(String noiBay) {
		this.noiBay = noiBay;
	}

	public String getNoiDen() {
		return noiDen;
	}

	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}

	public String getThoiGian() {
		return thoiGian;
	}

	public void setThoiGian(String thoiGian) {
		this.thoiGian = thoiGian;
	}

	@Override
	public String toString() {
		return "TicketModel [ticketId=" + ticketId + ", gia=" + gia + ", hangGhe=" + hangGhe + ", maMaybay=" + maMaybay
				+ ", ngayBay=" + ngayBay + ", ngayDen=" + ngayDen + ", noiBay=" + noiBay + ", noiDen=" + noiDen
				+ ", thoiGian=" + thoiGian + "]";
	}
	
	
	
	
	

}
