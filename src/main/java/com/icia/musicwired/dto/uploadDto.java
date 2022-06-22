package com.icia.musicwired.dto;

import lombok.Data;
import org.apache.ibatis.type.Alias;
import org.springframework.web.multipart.MultipartFile;

import java.sql.Date;

@Data
@Alias("audio")
public class uploadDto {
	private int muCode;
    private String muSinger;
	private String mId;
    private String muName;
    private String muGanre;  //장르
    private Date muDate;
    private String muImage; //포스터 이름
    private String muLyrics; //가사
    private int muHit;
    private int muPrice;
    private String mFile; //음악 파일 이름
    private MultipartFile muFile;  //음원
    private MultipartFile mImage;  //포스터

	public int getMuCode() {
		return muCode;
	}

	public void setMuCode(int muCode) {
		this.muCode = muCode;
	}

	public String getMuSinger() {
		return muSinger;
	}

	public void setMuSinger(String muSinger) {
		this.muSinger = muSinger;
	}

	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
	}

	public String getMuName() {
		return muName;
	}

	public void setMuName(String muName) {
		this.muName = muName;
	}

	public String getMuGanre() {
		return muGanre;
	}

	public void setMuGanre(String muGanre) {
		this.muGanre = muGanre;
	}

	public Date getMuDate() {
		return muDate;
	}

	public void setMuDate(Date muDate) {
		this.muDate = muDate;
	}

	public String getMuImage() {
		return muImage;
	}

	public void setMuImage(String muImage) {
		this.muImage = muImage;
	}

	public String getMuLyrics() {
		return muLyrics;
	}

	public void setMuLyrics(String muLyrics) {
		this.muLyrics = muLyrics;
	}

	public int getMuHit() {
		return muHit;
	}

	public void setMuHit(int muHit) {
		this.muHit = muHit;
	}

	public int getMuPrice() {
		return muPrice;
	}

	public void setMuPrice(int muPrice) {
		this.muPrice = muPrice;
	}

	public String getmFile() {
		return mFile;
	}

	public void setmFile(String mFile) {
		this.mFile = mFile;
	}

	public MultipartFile getMuFile() {
		return muFile;
	}

	public void setMuFile(MultipartFile muFile) {
		this.muFile = muFile;
	}

	public MultipartFile getmImage() {
		return mImage;
	}

	public void setmImage(MultipartFile mImage) {
		this.mImage = mImage;
	}

	@Override
	public String toString() {
		return "uploadDto{" +
				"muCode=" + muCode +
				", muSinger='" + muSinger + '\'' +
				", mId='" + mId + '\'' +
				", muName='" + muName + '\'' +
				", muGanre='" + muGanre + '\'' +
				", muDate=" + muDate +
				", muImage='" + muImage + '\'' +
				", muLyrics='" + muLyrics + '\'' +
				", muHit=" + muHit +
				", muPrice=" + muPrice +
				", mFile='" + mFile + '\'' +
				", muFile=" + muFile +
				", mImage=" + mImage +
				'}';
	}
}
