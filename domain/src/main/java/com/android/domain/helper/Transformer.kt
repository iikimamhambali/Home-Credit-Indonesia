package com.android.domain.helper

import io.reactivex.ObservableTransformer

abstract class Transformer<T> : ObservableTransformer<T, T>