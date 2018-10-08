public class DoubleNode
{
	private String word;
	private int wordCount;
	private DoubleNode next, prev;

	public DoubleNode(String word, int cnt, DoubleNode n, DoubleNode p)
	{
		this.word = word;
		wordCount=cnt;
		next=n;
		prev=p;
	}

	public String getWord()
	{
		return word;
	}

	public int getWordCount()
	{
		return wordCount;
	}

	public DoubleNode getNext()
	{
	   return next;
	}
	
	public DoubleNode getPrev()
	{
		return prev;
	}

	public void setWord(String word)
	{
		this.word = word;
	}

	public void setWordCount(int cnt)
	{
		wordCount=cnt;
	}

	public void setNext(DoubleNode n)
	{
		next = n;
	}
	
	public void setPrev(DoubleNode p)
	{
		prev = p;
	}
}