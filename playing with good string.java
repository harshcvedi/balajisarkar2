
	public static int PlayingGoodString(String str) {

		int ans = 0;
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (isvowels(ch) == true) {
				count++;
			} else {
				ans = Math.max(ans, count);
				count = 0;
			}

		}
		ans = Math.max(ans, count);
		return ans;
	}
