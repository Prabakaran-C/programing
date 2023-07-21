#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* next;
};


struct Node* createNode(int data) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->next = NULL;
    return newNode;
}

int main() {
    int numNodes, i, data;
    struct Node *head, *temp;


    printf("Enter the number of nodes: ");
    scanf("%d", &numNodes);

    head = NULL;
    for (i = 1; i <= numNodes; i++) {
        printf("Enter data for node %d: ", i);
        scanf("%d", &data);
        if (head == NULL) {
            head = createNode(data);
            temp = head;
        }
        else {
            temp->next = createNode(data);
            temp = temp->next;
        }
    }

    printf("\nData entered in the list:\n");
    temp = head;
    while (temp != NULL) {
        printf("Data = %d\n", temp->data);
        temp = temp->next;
    }

    return 0;
}
