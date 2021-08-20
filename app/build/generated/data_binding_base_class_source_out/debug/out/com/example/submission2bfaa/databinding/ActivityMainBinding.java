// Generated by view binder compiler. Do not edit!
package com.example.submission2bfaa.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.submission2bfaa.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialCardView CardView;

  @NonNull
  public final ActivityErrorBinding emptyLayout;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final RecyclerView rvGithub;

  @NonNull
  public final SearchView svUsername;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialCardView CardView, @NonNull ActivityErrorBinding emptyLayout,
      @NonNull ProgressBar progressBar, @NonNull RecyclerView rvGithub,
      @NonNull SearchView svUsername) {
    this.rootView = rootView;
    this.CardView = CardView;
    this.emptyLayout = emptyLayout;
    this.progressBar = progressBar;
    this.rvGithub = rvGithub;
    this.svUsername = svUsername;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.CardView;
      MaterialCardView CardView = ViewBindings.findChildViewById(rootView, id);
      if (CardView == null) {
        break missingId;
      }

      id = R.id.empty_layout;
      View emptyLayout = ViewBindings.findChildViewById(rootView, id);
      if (emptyLayout == null) {
        break missingId;
      }
      ActivityErrorBinding binding_emptyLayout = ActivityErrorBinding.bind(emptyLayout);

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.rv_github;
      RecyclerView rvGithub = ViewBindings.findChildViewById(rootView, id);
      if (rvGithub == null) {
        break missingId;
      }

      id = R.id.sv_username;
      SearchView svUsername = ViewBindings.findChildViewById(rootView, id);
      if (svUsername == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, CardView, binding_emptyLayout,
          progressBar, rvGithub, svUsername);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
