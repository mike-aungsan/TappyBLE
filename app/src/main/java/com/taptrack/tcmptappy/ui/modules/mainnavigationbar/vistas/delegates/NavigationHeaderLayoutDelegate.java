/*
 * Copyright (c) 2016. Papyrus Electronics, Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * you may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.taptrack.tcmptappy.ui.modules.mainnavigationbar.vistas.delegates;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hannesdorfmann.adapterdelegates.AbsAdapterDelegate;
import com.taptrack.tappyble.R;
import com.taptrack.tcmptappy.ui.modules.mainnavigationbar.vistas.WrappedNavItem;

import java.util.List;

import butterknife.ButterKnife;

public class NavigationHeaderLayoutDelegate extends AbsAdapterDelegate<List<WrappedNavItem>> {
    public static class WrappedHeader implements WrappedNavItem {

        public WrappedHeader() {

        }

        @Override
        public long getItemId() {
            return 45237;
        }
    }

    public NavigationHeaderLayoutDelegate(int viewType) {
        super(viewType);
    }

    @Override
    public boolean isForViewType(List<WrappedNavItem> items, int position) {
        return items.get(position) instanceof WrappedHeader;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.nav_header_interact_tappy,parent,false);
        return new HeadingVH(v);
    }

    @Override
    public void onBindViewHolder(@NonNull List<WrappedNavItem> items, int position, @NonNull RecyclerView.ViewHolder holder) {
        WrappedHeader heading = (WrappedHeader) items.get(position);
        HeadingVH h = (HeadingVH) holder;
    }

    protected static class HeadingVH extends RecyclerView.ViewHolder {

        public HeadingVH(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
