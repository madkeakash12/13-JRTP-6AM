public class Task1 {
	
	    public static boolean scoresIncreasing( int[] scores )
	    {
	        for ( int i = 0; i < scores.length - 1; i++ )
	        {
	            if ( scores[i + 1] < scores[i] )
	            {
	                return false;
	            }
	        }

	        return true;
	    }
	    public static boolean scores100( int[] scores )
	    {
	        for ( int i = 0; i < scores.length - 1; i++ )
	        {
	            if ( scores[i] == 100 && scores[i + 1] == 100 )
	            {
	                return true;
	            }
	        }

	        return false;
	    }

	    public static boolean scoresClump( int[] scores )
	    {
	        for ( int i = 0; i < scores.length - 2; i++ )
	        {
	            if ( scores[i + 2] - scores[i] <= 2 )
	            {
	                return true;
	            }
	        }

	        return false;
	    }

	    public static int scoresAverage( int[] scores )
	    {
	        return Math.max( average( scores, 0, scores.length / 2 - 1 ),
	                average( scores, scores.length / 2, scores.length - 1 ) );
	    }

	    private static int average( int[] scores, int start, int end )
	    {
	        int sum = 0;

	        for ( int i = start; i <= end; i++ )
	        {
	            sum += scores[i];
	        }

	        return sum / ( end - start + 1 );
	    }
	    public static int wordsCount( String[] words, int len )
	    {
	        int count = 0;

	        for ( String s : words )
	        {
	            if ( s.length() == len )
	            {
	                count++;
	            }
	        }

	        return count;
	    }

	    public static String[] wordsFront( String[] words, int n )
	    {
	        String[] result = new String[n];

	        for ( int i = 0; i < n; i++ )
	        {
	            result[i] = words[i];
	        }

	        return result;
	    }
	}

