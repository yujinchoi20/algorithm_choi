#include <stdio.h>

int n, front, rear;
int adj[1001][1001];
int visited_DFS[1001], visited_BFS[1001], queue[1001];

int DFS(int start){ //깊이 우선 탐색
    visited_DFS[start] = 1;
    
    for(int i = 0; i <= n; i++){
        if(adj[start][i] == 1 && !visited_DFS[i]){
            printf("%d ", i);
            DFS(i);
        }
    }
}
int BFS(int start){ //너비 우선 탐색
    visited_BFS[start] = 1;
    queue[rear++] = start;
    
    while (front < rear){
        start = queue[front++];
        
        for(int i = 1; i <= n; i++){
            if(adj[start][i] == 1 && !visited_BFS[i]){
                visited_BFS[i] = 1;
                printf("%d ", i);
                queue[rear++] = i;
            }
        }
    }
}
int main(){
    int m, start, x, y;
    scanf("%d %d %d", &n, &m, &start);
    
    for(int i = 1; i <= m; i++){
        scanf("%d %d", &x, &y);
        adj[x][y] = 1;
        adj[y][x] = 1;
    }
    printf("%d ", start);
    DFS(start);
    printf("\n");
    
    printf("%d ", start);
    BFS(start);
    
    return 0;
}