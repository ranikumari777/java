#include <stdio.h>
#include <stdlib.h>

typedef struct link {
    int info;
    struct link *next;
} node;

void addnode(node **h, node **p);
void print(node *head);

int main() {
    node *head = NULL, *prev = NULL;
    addnode(&head, &prev);
    addnode(&head, &prev);
    print(head);
    return 0;
}

void addnode(node **h, node **p) {
    node *nn;
    nn = (node *)malloc(sizeof(node));
    if (nn == NULL) {
        printf("Memory allocation failed\n");
        return;
    }
    
    printf("Enter value: ");
    scanf("%d", &nn->info);
    nn->next = NULL;

    if (*h == NULL) {
        *h = nn; 
    } else {
        (*p)->next = nn; 
    }
    *p = nn;
}

void print(node *head) {
    while (head != NULL) {
        printf("%d ", head->info);
        head = head->next;
    }
    printf("\n");
}