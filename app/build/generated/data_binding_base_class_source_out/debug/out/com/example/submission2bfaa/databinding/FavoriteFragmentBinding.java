// Generated by view binder compiler. Do not edit!
package com.example.submission2bfaa.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.submission2bfaa.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FavoriteFragmentBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ActivityErrorBinding errlayout;

  @NonNull
  public final ProgressBar progress;

  @NonNull
  public final RecyclerView recyclerFav;

  private FavoriteFragmentBinding(@NonNull ConstraintLayout rootView,
      @NonNull ActivityErrorBinding errlayout, @NonNull ProgressBar progress,
      @NonNull RecyclerView recyclerFav) {
    this.rootView = rootView;
    this.errlayout = errlayout;
    this.progress = progress;
    this.recyclerFav = recyclerFav;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FavoriteFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FavoriteFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.favorite_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FavoriteFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.errlayout;
      View errlayout = ViewBindings.findChildViewById(rootView, id);
      if (errlayout == null) {
        break missingId;
      }
      ActivityErrorBinding binding_errlayout = ActivityErrorBinding.bind(errlayout);

      id = R.id.progress;
      ProgressBar progress = ViewBindings.findChildViewById(rootView, id);
      if (progress == null) {
        break missingId;
      }

      id = R.id.recycler_fav;
      RecyclerView recyclerFav = ViewBindings.findChildViewById(rootView, id);
      if (recyclerFav == null) {
        break missingId;
      }

      return new FavoriteFragmentBinding((ConstraintLayout) rootView, binding_errlayout, progress,
          recyclerFav);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
