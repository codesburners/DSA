public class maximum_population_year {
    public static void main(String[] args) {
        int[][] logs = {
            {1950,1961},
            {1960,1971},
            {1970,1981}

        };
        System.out.println(maximumPopulation(logs));
    }

    private static int maximumPopulation(int[][] logs) {
        int[] p=new int[101];

        for(int[] log:logs)
        {
            int birth=log[0];
            int death=log[1];
            for(int i=birth;i<death;i++)
            {
                p[i-1950]++;
            }
        }
        int max=0;int early=1950;
        for(int i=0;i<p.length;i++)
        {
            if(p[i]>max)
            {
                max=p[i];
                early=i+1950;
            }
        }
        return early;
    }



}
