int rickshaw_ride = 0;
			int cab_ride = 0;
			for (int i = 0; i < rickshaw.length; i++) {
				rickshaw_ride += Math.min(rickshaw[i] * c1, c2);

			}

			for (int i = 0; i < cab.length; i++) {
				cab_ride += Math.min(cab[i] * c1, c2);

			}
			rickshaw_ride = Math.min(rickshaw_ride, c3);
			cab_ride = Math.min(cab_ride, c3);
			int ans = Math.min(c4, cab_ride + rickshaw_ride);
			System.out.println(ans);
