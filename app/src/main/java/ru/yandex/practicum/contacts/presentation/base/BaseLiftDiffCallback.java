package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;

public class BaseLiftDiffCallback <T extends ListDiffInterface<BaseLiftDiffCallback>> extends DiffUtil.ItemCallback<DiffUtil.ItemCallback> {
    T baseLiftDiffCallback;
    @Override
    public boolean areItemsTheSame(@NonNull DiffUtil.ItemCallback oldItem, @NonNull DiffUtil.ItemCallback newItem) {
        baseLiftDiffCallback = (T) oldItem;
        return baseLiftDiffCallback.theSameAs((BaseLiftDiffCallback) newItem);

    }

    @Override
    public boolean areContentsTheSame(@NonNull DiffUtil.ItemCallback oldItem, @NonNull DiffUtil.ItemCallback newItem) {
        baseLiftDiffCallback = (T) oldItem;
        return baseLiftDiffCallback.equals(newItem);
    }

    @Nullable
    @Override
    public Object getChangePayload(@NonNull DiffUtil.ItemCallback oldItem, @NonNull DiffUtil.ItemCallback newItem) {
        return newItem;
    }


}
