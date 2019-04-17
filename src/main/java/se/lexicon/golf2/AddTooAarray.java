package se.lexicon.golf2;

import java.util.Arrays;

public class AddTooAarray {
	public static int[] addToArray(int[] position, double toAdd) {
		boolean isAdded = false;

		for (int i = 0; i < position.length; i++) {
			if (position[i] == 0) {
				position[i] = (int) toAdd;
				isAdded = true;
				break;
			}
		}

		if (isAdded == false) {
			position = expandArray(position);
			position[position.length - 1] = (int) toAdd;
		}
		return position;
	}

	public static int[] expandArray(int[] source) {
		return Arrays.copyOf(source, source.length + 1);
	}

	public static double[] expandArray(double[] source) {
		return Arrays.copyOf(source, source.length + 1);
	}

	public static String[] addToArray(String[] result, String s) {
		boolean isAdded = false;

		for (int i = 0; i < result.length; i++) {
			if (result[i] == null) {
				result[i] = s;
				isAdded = true;
				break;
			}
		}

		if (isAdded == false) {
			result = expandArray(result);
			result[result.length - 1] = s;
		}
		return result;
	}

	private static String[] expandArray(String[] result) {
		// TODO Auto-generated method stub
		return Arrays.copyOf(result, result.length + 1);
	}

}
