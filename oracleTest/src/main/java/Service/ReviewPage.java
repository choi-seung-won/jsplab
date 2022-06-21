package Service;

import java.util.List;

import Member.MemberPage;

public class ReviewPage {
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public List<MemberPage> getMember() {
		return member;
	}
	public void setMember(List<MemberPage> member) {
		this.member = member;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	private int total;
	private int currentPage;
	private List<MemberPage> member;
	private int totalPages;
	private int startPage;
	private int endPage;
	
	public ReviewPage(List<MemberPage> member) {
		this.member = member;
	}

}
