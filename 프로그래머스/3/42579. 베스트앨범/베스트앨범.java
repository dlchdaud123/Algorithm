import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> genreTotalMap = new HashMap<>();
        Map<String, List<int[]>> songMap = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            genreTotalMap.put(genres[i], genreTotalMap.getOrDefault(genres[i], 0) + plays[i]);
            songMap.computeIfAbsent(genres[i], k -> new ArrayList<>()).add(new int[]{i, plays[i]});
        }

        List<String> sortedGenres = new ArrayList<>(genreTotalMap.keySet());
        sortedGenres.sort((a, b) -> genreTotalMap.get(b) - genreTotalMap.get(a));

        for (String genre : songMap.keySet()) {
            List<int[]> list = songMap.get(genre);
            list.sort((a, b) -> {
                if (b[1] != a[1]) return b[1] - a[1]; // 재생 수 내림차순
                return a[0] - b[0]; // 고유번호 오름차순
            });
        }

        List<Integer> result = new ArrayList<>();
        for (String genre : sortedGenres) {
            List<int[]> list = songMap.get(genre);
            for (int i = 0; i < Math.min(2, list.size()); i++) {
                result.add(list.get(i)[0]);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}