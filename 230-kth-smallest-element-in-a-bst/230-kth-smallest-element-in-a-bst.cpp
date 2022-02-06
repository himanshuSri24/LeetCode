/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int result = -1, count;
    bool flag = false;
    
    void helper(TreeNode* root)
    {
        if(root == NULL)
        {
            return;
        }
        else
        {
            helper(root->left);
            // cout << root->val << endl;
            count--;
            // cout << root->val << flag << count << endl;
            if(count == 0)
            {
                result = root->val;
                // flag = true;
                // cout << result << endl;
                return;
            }
            
            helper(root->right);
        }
    }
    
    int kthSmallest(TreeNode* root, int k) {
        count = k;
        helper(root);
        return result;
    }
};