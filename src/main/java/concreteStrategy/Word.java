package concreteStrategy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Word {

	// Implementing concrete strategy pattern ( sorting )
	// Using a static factory method to avoid several instantiations

	private String mText;

	// Comparator returned is serializable
	public static final Comparator<Word> STRING_LENGTH_COMPARATOR_ASCENDING = new StrLenCompAsc();
	public static final Comparator<Word> STRING_LENGTH_COMPARATOR_DESCENDING = new StrLenCompDes();

	public Word( String iText ){
		this.mText = iText;
	}
 
	@Override
	public String toString(){
		return this.mText;
	}

	private static class StrLenCompAsc implements Comparator<Word>, Serializable {
		private static final long serialVersionUID = 1864624970323907413L;

		public int compare( Word iFirst, Word iSecond ){
			return iFirst.toString().length() - iSecond.toString().length();
		}

	}

	private static class StrLenCompDes implements Comparator<Word>, Serializable {
		private static final long serialVersionUID = -306857695300292621L;

		public int compare( Word iFirst, Word iSecond ){
			return iSecond.toString().length() - iFirst.toString().length();
		}

	}

	public static void main( String[] args ){

		List<Word> lSentence = new ArrayList<Word>();
		lSentence.add( new Word( "Hi" ) );
		lSentence.add( new Word( "World," ) );
		lSentence.add( new Word( "is" ) );
		lSentence.add( new Word( "everything" ) );
		lSentence.add( new Word( "okay?" ) );

		Collections.sort( lSentence, Word.STRING_LENGTH_COMPARATOR_ASCENDING );
		System.out.println( lSentence );

		Collections.sort( lSentence, Word.STRING_LENGTH_COMPARATOR_DESCENDING );
		System.out.println( lSentence );

	}
}
