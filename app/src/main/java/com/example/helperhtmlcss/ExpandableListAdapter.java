package com.example.helperhtmlcss;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.helperhtmlcss.DirectoryCSS;
import com.example.helperhtmlcss.R;

public class ExpandableListAdapter extends BaseExpandableListAdapter {
Context context;
    private Object ImageView;


    public ExpandableListAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getGroupCount() {
        return 8;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return 2;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return null;
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return null;
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View groupView, ViewGroup parent) {
        if(groupView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            groupView = inflater.inflate(R.layout.listview_html, null);
        }
        switch (groupPosition){
            case 0: {
                ((TextView) groupView.findViewById(R.id.groupnamehtml)).setText("HTML основы");

            } break;
            case 1: {
                ((TextView) groupView.findViewById(R.id.groupnamehtml)).setText("Текст");

            }break;
            case 2: {
                ((TextView) groupView.findViewById(R.id.groupnamehtml)).setText("Списки");
            }break;
            case 3:{
                ((TextView) groupView.findViewById(R.id.groupnamehtml)).setText("Ссылки");
            }break;
            case 4: {
                ((TextView) groupView.findViewById(R.id.groupnamehtml)).setText("Изображения");
            }break;
            case 5: {
                ((TextView) groupView.findViewById(R.id.groupnamehtml)).setText("Таблицы");
            }break;
            case 6: {
                ((TextView) groupView.findViewById(R.id.groupnamehtml)).setText("Формы");
            }break;
            case 7: {
                ((TextView) groupView.findViewById(R.id.groupnamehtml)).setText("Практические задания");
            }break;
            default:
        }
        return groupView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View childView, ViewGroup parent) {
LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
childView = inflater.inflate(R.layout.listview_html_, null);
switch (groupPosition){
    case 0: {
        switch (childPosition){
            case 0: {
                ((TextView) childView.findViewById(R.id.listviewhtml_)).setText("Теория");
            }break;
            case 1: {
                ((TextView) childView.findViewById(R.id.listviewhtml_)).setText("Самоконтроль");
            }
        }
    }break;
    case 1: {
        switch (childPosition){
            case 0: {
                ((TextView) childView.findViewById(R.id.listviewhtml_)).setText("Теория");
            }break;
            case 1: {
                ((TextView) childView.findViewById(R.id.listviewhtml_)).setText("Самоконтроль");
            }
        }
    }break;
    case 2: {
        switch (childPosition){
            case 0: {
                ((TextView) childView.findViewById(R.id.listviewhtml_)).setText("Теория");
            }break;
            case 1: {
                ((TextView) childView.findViewById(R.id.listviewhtml_)).setText("Самоконтроль");
            }
        }
    }break;
    case 3: {
        switch (childPosition){
            case 0: {
                ((TextView) childView.findViewById(R.id.listviewhtml_)).setText("Теория");
            }break;
            case 1: {
                ((TextView) childView.findViewById(R.id.listviewhtml_)).setText("Самоконтроль");
            }
        }
    }break;
    case 4: {
        switch (childPosition){
            case 0: {
                ((TextView) childView.findViewById(R.id.listviewhtml_)).setText("Теория");
            }break;
            case 1: {
                ((TextView) childView.findViewById(R.id.listviewhtml_)).setText("Самоконтроль");
            }
        }
    }break;
    case 5: {
        switch (childPosition){
            case 0: {
                ((TextView) childView.findViewById(R.id.listviewhtml_)).setText("Теория");
            }break;
            case 1: {
                ((TextView) childView.findViewById(R.id.listviewhtml_)).setText("Самоконтроль");
            }
        }
    }break;
    case 6: {
        switch (childPosition){
            case 0: {
                ((TextView) childView.findViewById(R.id.listviewhtml_)).setText("Теория");
            }break;
            case 1: {
                ((TextView) childView.findViewById(R.id.listviewhtml_)).setText("Самоконтроль");
            }
        }
    }break;
    case 7: {
        switch (childPosition){
            case 0: {
                ((TextView) childView.findViewById(R.id.listviewhtml_)).setText("Практическое задание 1");
            }break;
            case 1: {
                ((TextView) childView.findViewById(R.id.listviewhtml_)).setText("Практическое задание 2");
            }
        }
    }break;
}
        return childView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
