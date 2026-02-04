/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
int minDepth(struct TreeNode* root) {
    if(root==NULL){
        return 0;
    }
    int leftheight=minDepth(root->left);
    int rightheight=minDepth(root->right);
    if(root->left==NULL){
        return rightheight+1;
    }
    if(root->right==NULL){
        return leftheight+1;
    }
    return (leftheight < rightheight? leftheight:rightheight)+1;

}
