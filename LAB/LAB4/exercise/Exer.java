package exercise;

public class Exer {

	public static void main(String[] args) {

	}

}

abstract class Item {
	private long idNo;
	private String title;
	private int noOfCopies;

	public long getIdNo() {
		return idNo;
	}
	public void print() {
		
	}
	

	public void setIdNo(long idNo) {
		this.idNo = idNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public Item() {
		super();
	}

	@Override
	public String toString() {
		return "Item [idNo=" + idNo + ", title=" + title + ", noOfCopies=" + noOfCopies + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idNo ^ (idNo >>> 32));
		result = prime * result + noOfCopies;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (idNo != other.idNo)
			return false;
		if (noOfCopies != other.noOfCopies)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	

}

abstract class WrittenItem extends Item {

	private String author;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	

}

class JournalPaper extends WrittenItem {
	private int publishedYear;

}

class MediaItem extends Item {
	private int runtime;

}

class Video extends MediaItem {
	private String director;
	private String genre;
	private int yearReleased;

}

class CD extends MediaItem {
	private String artist;
	private String genre;

}