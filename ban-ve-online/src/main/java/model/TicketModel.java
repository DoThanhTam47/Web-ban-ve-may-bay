package model;

import java.io.Serializable;

public class TicketModel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int ticketId;
	private String maMaybay;
	private String noiBay;
	private String noiDen;
	private String ngayBay;
	private String ngayDen;
	private String thoiGian;
	private String hangGhe;
	private long gia;
	
	public TicketModel() {
	}

	public TicketModel(String maMaybay, String noiBay, String noiDen, String ngayBay, String ngayDen, String thoiGian,
			String hangGhe, long gia) {
		this.maMaybay = maMaybay;
		this.noiBay = noiBay;
		this.noiDen = noiDen;
		this.ngayBay = ngayBay;
		this.ngayDen = ngayDen;
		this.thoiGian = thoiGian;
		this.hangGhe = hangGhe;
		this.gia = gia;
	}

	public TicketModel(int ticketId, String maMaybay, String noiBay, String noiDen, String ngayBay, String ngayDen,
			String thoiGian, String hangGhe, long gia) {
		this.ticketId = ticketId;
		this.maMaybay = maMaybay;
		this.noiBay = noiBay;
		this.noiDen = noiDen;
		this.ngayBay = ngayBay;
		this.ngayDen = ngayDen;
		this.thoiGian = thoiGian;
		this.hangGhe = hangGhe;
		this.gia = gia;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public String getMaMaybay() {
		return maMaybay;
	}

	public void setMaMaybay(String maMaybay) {
		this.maMaybay = maMaybay;
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

	public String getNgayBay() {
		return ngayBay;
	}

	public void setNgayBay(String ngayBay) {
		this.ngayBay = ngayBay;
	}

	public String getNgayDen() {
		return ngayDen;
	}

	public void setNgayDen(String ngayDen) {
		this.ngayDen = ngayDen;
	}

	public String getThoiGian() {
		return thoiGian;
	}

	public void setThoiGian(String thoiGian) {
		this.thoiGian = thoiGian;
	}

	public String getHangGhe() {
		return hangGhe;
	}

	public void setHangGhe(String hangGhe) {
		this.hangGhe = hangGhe;
	}

	public long getGia() {
		return gia;
	}

	public void setGia(long gia) {
		this.gia = gia;
	}

}
