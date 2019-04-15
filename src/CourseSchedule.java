public class CourseSchedule {
  public boolean canFinish(int numCourses, int[][] prerequisites) {
    ArrayList[] graph = new ArrayList[numCourses];
    int[] degree = new int[numCourses];
    Queue queue = new LinkedList();
    int count=0;

    for(int i=0;i<numCourses;i++)
      graph[i] = new ArrayList();
    //directed graphs so prerequisites points to the course
    for(int i=0; i<prerequisites.length;i++){
      degree[prerequisites[i][1]]++;
      graph[prerequisites[i][0]].add(prerequisites[i][1]);
    }
    // degree is number of courses that the course is prerequisite for
    for(int i=0; i<degree.length;i++){
      if(degree[i] == 0){
        queue.add(i);
        count++;
      }
    }
    while(!queue.isEmpty()) {
      int course = queue.poll();
      for (int i = 0; i<graph[course].size(); i++) {
        int pointer = graph[course].get(i);
        degree[pointer]--;
        if (degree[pointer] == 0) {
          queue.add(pointer);
          count++;
        }
      }
    }
    if(count == numCourses) return true;
    return false;

  }
}
/*
2, [[1,0],[0,1]]

Graph => 0:[1],1:[0] // 2 Course
degree => [1,1] // an array of basically index is the course and the value is the number of prerequisites it is used for
count => 0 // basically any course that isnt a prerequisite for another course

// now to keep track of how many prerequisites are there for each of these courses => go through prerequisites and
2, [[1,0]]

Graph => 1:[0], 0:[]
degree => [1,0]
queue => 1 (course that is not a prerequisite for anything)

*
